// 引入React
import React from 'react'
import PropTypes from 'prop-types'

// const List = props => {
//   const arr = props.colors
//   const lis = arr.map((item, index) => <li key={index}>{item.name}</li>)
//   return <ul>{lis}</ul>
// }

// List.propTypes = {
//   colors: PropTypes.array
// }


// 组件之间的值传递   父子组件
class SonComponent extends React.Component {
  chanegFatherMsg = () => {
    this.props.changeFatherMethod1("abc")
  }

  chanegFatherMsg2 = () => {
    alert(this.props.msg2)
  }

  render () {
    return (
      <div>
        <div>
          子组件2
          {this.props.msg2}
        </div>
        <button onClick={this.chanegFatherMsg}>ChangeFatherMessage</button>
        <button onClick={this.chanegFatherMsg2}>2222</button>
      </div>
    )
  }
}

SonComponent.propTypes = {
  msg2: PropTypes.string
}
export default SonComponent