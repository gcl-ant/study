// 引入React
import React from 'react'

// 定义类组件
class HelloC extends React.Component {

  clickHader1 = (event, id) => {
    console.log(this)
  }

  clickHader2 () {
    console.log(this)
  }
  render () {
    return (
      <div>
        <div onClick={event => this.clickHader1(event)}>这是我的第一个类组件111!</div>
        <div onClick={this.clickHader2}>这是我的第一个类组件222!</div>
      </div>
    )
  }
}

export default HelloC