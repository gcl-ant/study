// 引入React
import React from 'react'
import SonComponent from './SonComponent'

function SonFunction (props) {
  console.log(props)
  return (
    <div>
      子组件1
      {props.msg1}
    </div>
  )
}

// 定义类组件
class FatherComponent extends React.Component {

  state = {
    message: "aasadasda",
    arr: ["aaa", "bbb"]
  }
  changeFatherMethod2 = (value) => {
    this.setState({
      message: value
    })

    alert(this.state.message)
  }

  render () {
    return (
      <div>
        <SonFunction msg1={this.state.message} />
        <SonComponent msg2={this.state.arr} changeFatherMethod1={this.changeFatherMethod2} />
      </div>
    )
  }
}

export default FatherComponent