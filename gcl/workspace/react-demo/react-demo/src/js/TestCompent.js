// 引入React
import React from 'react'


// 定义类组件
class TestCompent extends React.Component {

  state = {
    count: 0,
    list: [1, 2, 3],
    person: {
      name: 'jack',
      age: 18
    }
  }


  setCount = () => {
    this.setState({
      count: this.state.count + 1,
      list: [...this.state.list, 4],
      person: {
        ...this.state.person,
        // 覆盖原来的属性 就可以达到修改对象中属性的目的
        name: 'rose'
      }
    })
  }

  render () {
    return (
      <div>
        <button onClick={(event) => this.setCount(event)}>Add_Count</button>
        <span>当前数据是{this.state.count}</span>
      </div>
    )
  }

}

export default TestCompent