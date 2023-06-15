// 导入useNavigate函数
import { useNavigate } from 'react-router-dom'

// function Demo02() {
//   const navigate = useNavigate()
//   return (
//     <div className="App">

//       <div>
//         Home
//         <button onClick={() => navigate('/about')}> 跳转关于页 </button>
//       </div>
//     </div>
//   )
// }

const Home = () => {
  // 执行函数
  const navigate = useNavigate()
}

function Demo02() {
  return (
    <div>
      Home
      <button onClick={() => navigate('/about')}> 跳转关于页 </button>
    </div>
  )
}

export default Demo02
