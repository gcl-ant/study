import './app.css'
import HelloC from './js/Hello2'
import TestCompent from './js/TestCompent'
import InputComponent from './js/InputComponent'
import FatherComponent from './js/FatherComponent'



function App () {
  let songs = [{ id: '1', name: "极乐净土" }, { id: '2', name: "孤勇者" }]

  const showNowId = (event, key) => {
    console.log("当前ID:" + key)
  }
  function LoopSong () {
    return (
      <ul>
        {
          songs.map(song => (
            <li key={song.id} onClick={event => showNowId(event, song.id)}>
              {song.name}
            </li>
          ))
        }
      </ul>
    )
  }
  let falg = true
  const getHtag = (type) => {
    if (type === 1) {
      return <h1>hello</h1>
    } else if (type === 2) {
      return <h2>hello2</h2>
    } else {
      return <h3>hello3</h3>
    }
  }

  const mystype = {
    color: "blue"
  }


  function Test11 () {
    return <h1>Hello, word2</h1>
  }

  function Test222 () {
    const clickFunction = (event) => {
      console.log(event)
      alert("Test222 on click")
    }
    return <h2 onClick={clickFunction}>Hello, word2222</h2>
  }



  return (
    // <h1>你好，{name}</h1>,

    //   <ul>
    //   {
    //     songs.map(song => {
    //       return <li>{song.name}</li>
    //     }
    //     )
    //   }
    // </ul>,
    <div>
      {getHtag(3)}
      {falg && <h1>aaaaa</h1>}
      <div style={{ color: 'red' }}>this is a div1</div>
      <div style={mystype}>(this
        is a div2)</div>
      <div className={falg && 'my_test_font'}>this is a div3</div>

      <Test222 />
      <Test11></Test11>
      {/* <Hello2></Hello2> */}

      <LoopSong></LoopSong>

      <HelloC></HelloC>

      <TestCompent />

      <InputComponent />

      <FatherComponent />
    </div>
  )
}

export default App
