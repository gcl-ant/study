import { Table, Card, Breadcrumb } from "antd"
import { Link } from "react-router-dom"
import { observer } from 'mobx-react-lite'
import "./index.scss"
import { useEffect, useState } from "react"
import { http } from '@/utils'

const Goods = () => {
  const [goodData, setGoodData] = useState({
    list: [],
    count: 0,
  })

  const [params, setParams] = useState({
    page: 1,
    per_page: 10,
  })

  // 获取商品列表
  useEffect(() => {
    const loadList = async () => {
      const res = await http.get('/mp/articles', { params })
      const { results, total_count } = res.data
      setGoodData({
        list: results,
        count: total_count
      })
    }
    loadList()
  }, [params])

  // 翻页实现
  const pageChange = (page) => {
    setParams({
      ...params,
      page,
    })
  }

  const columns = [
    {
      title: "商品名",
      dataIndex: "good_name",
      width: 120,
    },
    {
      title: "进价",
      dataIndex: "in_price",
      width: 120,
    },
    {
      title: "售价",
      dataIndex: "out_price",
    },
    {
      title: "描述",
      dataIndex: "good_desc",
    },
    {
      title: "数量",
      dataIndex: "number",
    },
    {
      title: "有效期限",
      dataIndex: "validity_time",
    },
    {
      title: "状态",
      dataIndex: "is_delete",
    },
    {
      title: "折扣",
      dataIndex: "discount_flg",
    }
  ]

  return (
    <div>
      <Card
        title={
          <Breadcrumb separator=">">
            <Breadcrumb.Item>
              <Link to="/home">首页</Link>
            </Breadcrumb.Item>
            <Breadcrumb.Item>商品一览</Breadcrumb.Item>
          </Breadcrumb>
        }
        style={{ marginBottom: 20 }}
      ></Card>
      <Card title={`商品一览结果如下：`}>
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
        />
      </Card>
    </div>
  )
}

export default observer(Goods)
