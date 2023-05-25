// 引入React
import React, { createRef } from 'react'

// 定义类组件
class InputComponent extends React.Component {

  divRef = createRef()
  state = {
    message: "aaa"
  }
  changeMessage = (e) => {
    this.setState(
      {
        message: e.target.value
      }
    )
  }

  changeHandler = () => {
    console.log(this.divRef.current.value)
  }

  render () {
    return (
      <div>
        <input value={this.state.message} onChange={(event) => this.changeMessage(event)}></input>
        <button onClick={e => alert("now message:" + this.state.message)}>showMeMessage</button>

        <input ref={this.divRef} />
        <button onClick={this.changeHandler}>click</button>
      </div >
    )
  }
}

export default InputComponent