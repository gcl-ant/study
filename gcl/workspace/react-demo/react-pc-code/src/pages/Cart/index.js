import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import { Card, Breadcrumb, Form, Button, Radio, Table, Space } from 'antd';
import moment from 'moment';
import 'moment/locale/zh-cn';
import locale from 'antd/es/date-picker/locale/zh_CN';
import './index.scss';

//测试
const CartItems = [
  { id: 1, goodName: '商品1', price: 0, number: 1 },
  { id: 2, goodName: '商品2', price: 10, number: 2 },
  { id: 3, goodName: '商品3', price: 10, number: 1 },
];

const Cart = () => {
  const [cartItems, setCartItems] = useState(CartItems); 
  const [totalPrice, setTotalPrice] = useState(
    CartItems.reduce((total, item) => total + item.price * item.number, 0) //算总价，初始值0
  ); 

  // 添加商品
  const addToCart = (item) => {
    setCartItems([...cartItems, item]);
    setTotalPrice(totalPrice + item.price * item.number);
  };

  // 移除商品
  const removeFromCart = (item) => {
  const updatedCartItems = cartItems.filter((cartItem) => cartItem !== item);
  setCartItems(updatedCartItems);
  setTotalPrice(totalPrice - item.price * item.number);
  };



  // 增加商品数量   map方法遍历
  const increaseNumber = (item) => {
    const updatedCartItems = cartItems.map((cartItem) => {
      if (cartItem.id === item.id) {
        return { ...cartItem, number: cartItem.number + 1 };
      }
      return cartItem;
    });
    setCartItems(updatedCartItems);
    setTotalPrice(totalPrice + item.price);
  };

  // 减少数量
  const decreaseNumber = (item) => {
      const updatedCartItems = cartItems.map((cartItem) => {
        if (cartItem.id === item.id) {
          return { ...cartItem, number: cartItem.number - 1 };
        }
        return cartItem;
      });
      setCartItems(updatedCartItems);
      setTotalPrice(totalPrice - item.price);
    }
  

  const Checkout = () => {
    // 结算后要清空购物车  返回空和总价归0
    setCartItems([]);
    setTotalPrice(0);
  };
  
   // 购物车表格
  const columns = [
    {
      title: '商品名称',
      dataIndex: 'goodName',
      key: 'goodName',
    },
    {
      title: '价格',
      dataIndex: 'price',
      key: 'price',
    },
    {
      title: '数量',
      dataIndex: 'number',
      key: 'number',
      render: (text, record) => (
        <Space size="middle">
          <Button onClick={() => decreaseNumber(record)}>-</Button>
          {record.number}
          <Button onClick={() => increaseNumber(record)}>+</Button>
        </Space>
      ),
    },
    {
      title: '操作',  //移除按钮
      key: 'action',
      render: (text, record) => (
        <Space size="middle">
          <Button
            onClick={() => removeFromCart(record)}
            >
              移除
            </Button>
          </Space>
        ),
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
              <Breadcrumb.Item>购物车</Breadcrumb.Item>
            </Breadcrumb>
          }
          style={{ marginBottom: 20 }}
        >
          {/* 购物车表格 */}  
          <Table columns={columns} dataSource={CartItems} />
  
          <p>总价: {totalPrice}</p>
  
          <Button onClick={Checkout}>结算</Button>
        </Card>
      </div>
    );
  };
  
  export default Cart;
  