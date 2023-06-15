import React from "react"
import SonComponcet from "./SonComponent"

function SonFunction (props) {
  console.log(props)
  return (
    <div>{props.msg1}</div>
  )
}

class FatherComponent extends React.Component {

  state = {
    message1: 'this is message1',
    message2: 'this is message2',
    arr: ["a", "b", "c"]
  }

  changeFatherMethod2 = (value) => {
    this.setState({
      message2: value
    })

    alert(this.state.message2)
  }

  render () {
    return (
      <div>
        <SonFunction msg1={this.state.message1}></SonFunction>
        <SonComponcet msg2={this.state.message2} changeFatherMethod1={this.changeFatherMethod2}></SonComponcet>
        <SonComponcet msg2={this.state.arr} changeFatherMethod1={this.changeFatherMethod2}></SonComponcet>
      </div>
    )
  }
}

export default FatherComponent