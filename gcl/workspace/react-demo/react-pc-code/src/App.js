import { unstable_HistoryRouter as HistoryRouter, Routes, Route } from 'react-router-dom'
import { history } from './utils'

import './App.css'
import { AuthComponent } from '@/components/AuthComponent'
import { lazy, Suspense } from 'react'

// 按需导入组件
const Login = lazy(() => import('./pages/Login'))
const Layout = lazy(() => import('./pages/Layout'))
const Home = lazy(() => import('./pages/Home'))
const Article = lazy(() => import('./pages/Article'))
const Publish = lazy(() => import('./pages/Publish'))
const GoodList = lazy(() => import('./pages/good/list'))
const ShopCar = lazy(() => import('./pages/Cart'))
const MoneyList = lazy(() => import('./pages/MoneyList'))

function App () {
  return (
    // 路由配置
    <HistoryRouter history={history}>
      <div className="App">
        <Suspense
          fallback={
            <div
              style={{
                textAlign: 'center',
                marginTop: 200
              }}
            >
              loading...
            </div>
          }
        >
          <Routes>
            {/* 创建路由path和组件对应关系 */}
            {/* Layout需要鉴权处理的 */}
            {/* 这里的Layout不一定不能写死 要根据是否登录进行判断 */}
            <Route path='/' element={
              <AuthComponent>
                <Layout />
              </AuthComponent>
            }>
              <Route index element={<Home />}></Route>
              <Route path='article' element={<Article />}></Route>
              <Route path='publish' element={<Publish />}></Route>
              <Route path='good/list' element={<GoodList />}></Route>
              <Route path='cart' element={<ShopCar />}></Route>
              <Route path='moneyList' element={<MoneyList />}></Route>
            </Route>
            {/* 这个不需要 */}
            <Route path='/login' element={<Login />}></Route>
          </Routes>
        </Suspense>
      </div>
    </HistoryRouter>
  )
}

export default App
