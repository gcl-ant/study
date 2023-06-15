import React from "react"
import PropTypes from 'prop-types'

const List = props => {
  const arr = props.colors
  const lis = arr.map((item, index) => <li key={index}>{item.name}</li>)
  return <ul>{lis}</ul>
}

List.propTypes = {
  colors: PropTypes.array
}

class SonComponcet extends React.Component {
  changeFatherMsg = () => {
    this.props.changeFatherMethod1("abc")
  }
  alertFatherArr = () => {
    alert(this.props.msg2)
  }
  render () {
    return (
      <div>
        <div>{this.props.msg2}</div>
        <button onClick={this.changeFatherMsg}>ChangeFatherMessage</button>
        <button onClick={this.alertFatherArr}>AlertFatherArr</button>
      </div>
    )
  }
}

SonComponcet.propTypes = {
  msg: PropTypes.string
}

export default SonComponcet