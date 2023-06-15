import './app.css'
import SubTest from './js/SubApp'
import TestComponent from './js/TestComponent'
import ImputComponent from './js/ImputComponent'
import FatherComponent from './js/FatherComponent'

function App () {

  const name = 'world'
  let code = [{ id: 1, name: "a" }, { id: 2, name: "b" }, { id: 3, name: "c" }]
  let falg = true
  const getcode = (type) => {
    if (type == 1) {
      return <h1>hello 1</h1>
    } else if (type == 2) {
      return <h2>hello 2</h2>
    } else {
      return <h3>hello 3</h3>
    }
  }
  const styleObj = { color: "blue" }

  function Test1 () {
    return <h1>hello world 1</h1>
  }

  function Test2 () {
    const clickFunction = () => {
      alert("Test on click")
    }
    return <h1 onClick={clickFunction}>hello world 2</h1>
  }

  function Loopcode () {
    const showNowId = (event, key) => {
      console.log("ThisID:" + key)
    }
    return (
      <ul>
        {code.map(code =>
          <li key={code.id} onClick={(event) => showNowId(event, code.id)}>
            {code.name}
          </li>)}
      </ul>
    )
  }

  return (
    <div>

      <h1>hello {name}</h1>

      {
        code.map(code =>
          <li>{code.id}-{code.name}</li>)
      }

      {falg ? 'A' : 'B'}

      {falg && <h1>abc</h1>}

      {getcode(1)}
      {getcode(2)}
      {getcode(3)}

      <div style={{ color: 'red' }}>this is a red div</div>
      <div style={styleObj}>this is a blue div</div>

      <div className={falg && 'my_test_font'}>this is a aqua div</div>

      <Test1></Test1>
      <Test2></Test2>
      <Loopcode></Loopcode>
      <SubTest></SubTest>
      <TestComponent></TestComponent>
      <ImputComponent></ImputComponent>
      <FatherComponent></FatherComponent>

    </div>
  )
}

export default App
