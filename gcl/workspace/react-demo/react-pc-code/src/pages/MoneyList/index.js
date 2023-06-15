import {
  Table,
  Card,
  Breadcrumb,
  Space,
  Button,
  Popconfirm,
  message,
} from "antd"
import { Link, useNavigate } from "react-router-dom"
import { observer } from "mobx-react-lite"
import "./index.scss"
import { useEffect, useState } from "react"
import { http } from "@/utils"
import { ShoppingCartOutlined } from "@ant-design/icons"


const MoneyList = () => {
  const MoneyListItems = [
    { id: 1, date: "2023/06/01", mode: "入金", money: 1000, kind: "成功" },
    { id: 2, date: "2023/06/01", mode: "出金", money: 500, kind: "成功" },
    { id: 3, date: "2023/06/01", mode: "出金", money: 250, kind: "失敗" },

  ]

  const [goodData, setGoodData] = useState({
    list: [],
    count: 0,
  })

  const [params, setParams] = useState({
    page: 1,
    per_page: 10,
  })

  useEffect(() => {
    const loadList = async () => {
      const res = await http.get("/mp/articles", { params })
      const { results, total_count } = res.data
      setGoodData({
        list: results,
        count: total_count,
      })
    }
    loadList()
  }, [params])

  const pageChange = (page) => {
    setParams({
      ...params,
      page,
    })
  }

  const columns = [
    {
      title: "No.",
      dataIndex: "id",
      width: 120,
    },
    {
      title: "日期",
      dataIndex: "date",
      width: 240,
    },
    {
      title: "方法",
      dataIndex: "mode",
      width: 240,
    },
    {
      title: "金額",
      dataIndex: "money",
      width: 240,
    },
    {
      title: "狀態",
      dataIndex: "kind",
      width: 240,
    },
  ]

  return (
    <div>
      <Card title={
        <Breadcrumb separator=">">
          <Breadcrumb.Item>
            <Link to="/home">首页</Link>
          </Breadcrumb.Item>
          <Breadcrumb.Item>入出金一览</Breadcrumb.Item>
        </Breadcrumb>
      }
        style={{ marginBottom: 20 }}>
        <Table
          rowKey="id"
          columns={columns}
          pagination={{
            pageSize: params.per_page,
            total: goodData.count,
            onChange: pageChange,
            current: params.page,
          }}
          bordered
          dataSource={MoneyListItems}
        />

        <p>帐号余额:</p>
      </Card>
    </div>
  )
}

export default observer(MoneyList)
