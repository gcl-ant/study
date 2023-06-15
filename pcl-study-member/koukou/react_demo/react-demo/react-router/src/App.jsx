import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Demo01 from './js/Demo01'
//import Demo02 from './js/Demo02'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <Demo01></Demo01>
    </div>
  )
}

export default App
