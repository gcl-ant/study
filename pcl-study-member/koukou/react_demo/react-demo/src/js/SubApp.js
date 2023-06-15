import React from "react"

class SubTest extends React.Component {

  clickHandler1 = (event, id) => {
    console.log(this)
  }

  clickHandler2 () {
    console.log(this)
  }

  render () {
    return (
      <div>
        <div onClick={(event) => this.clickHandler1(event, '123')}>this is a sub div 1</div>
        <div onClick={this.clickHandler2}>this is a sub div 2</div>
      </div>
    )
  }

}

export default SubTest