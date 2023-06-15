import React from "react"

class TestComponent extends React.Component {

  state = {
    count: 0
  }

  setCount = () => {
    this.setState({
      count: this.state.count + 1
    })
  }

  render () {
    return (
      <div>
        <button onClick={(event) => this.setCount(event)}>Test Button</button>
        <span>Data is {this.state.count}</span>
      </div>
    )
  }
}

export default TestComponent