import React from "react"

class ImputComponent extends React.Component {

  state = {
    message: "abc"
  }

  changeMessage = (e) => {
    this.setState({
      message: e.target.value
    })
  }

  render () {
    return (
      <div>
        <input value={this.state.message} onChange={(event) => this.changeMessage(event)}></input>
        <button onClick={(event) => alert("now message:" + this.state.message)}>Test Button</button>
      </div>
    )
  }
}

export default ImputComponent