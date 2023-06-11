import {
  Table,
  Card,
  Breadcrumb,
  Space,
  Button,
  Popconfirm,
  message,
} from "antd";
import { Link, useNavigate } from "react-router-dom";
import { observer } from "mobx-react-lite";
import "./index.scss";
import { useEffect, useState } from "react";
import { http } from "@/utils";
import { ShoppingCartOutlined } from "@ant-design/icons";


const Goods = () => {
  const GoodItems = [
    { id: 1, good_name: "レタス", price: 98, number: 50 },
    { id: 2, good_name: "キャベツ", price: 98, number: 50 },
    { id: 3, good_name: "パプリカ", price: 98, number: 50 },
  ];

  const [goodData, setGoodData] = useState({
    list: [],
    count: 0,
  });

  const [params, setParams] = useState({
    page: 1,
    per_page: 10,
  });

  const navigate = useNavigate();
  const onConfirm = () => {
    message.success("购物车加入成功");
  
  };

  // 获取商品列表
  useEffect(() => {
    const loadList = async () => {
      const res = await http.get("/mp/articles", { params });
      const { results, total_count } = res.data;
      setGoodData({
        list: results,
        count: total_count,
      });
    };
    loadList();
  }, [params]);

  // 翻页实现
  const pageChange = (page) => {
    setParams({
      ...params,
      page,
    });
  };

  const columns = [
    {
      title: "商品名",
      dataIndex: "good_name",
      width: 120,
    },
    {
      title: "价格",
      dataIndex: "price",
    },
    {
      title: "数量",
      dataIndex: "number",
    },
    {
      title: "操作",
      render: () => {
        return (
          <Space size="middle">
            <Button
              type="primary"
              shape="circle"
              icon={<ShoppingCartOutlined />}
            >
              <Popconfirm
                onConfirm={onConfirm}
                title="确认加入购物车？"
                okText="确定"
                cancelText="取消"
              >
                加入购物车
              </Popconfirm>
            </Button>
          </Space>
        );
      },
      fixed: "right",
    },
  ];

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
          dataSource={GoodItems}
        />
      </Card>
      <Card>
        <Button onClick={()=>navigate("/cart")}>查看购物车</Button>
      </Card>
    </div>
  );
};

export default observer(Goods);
