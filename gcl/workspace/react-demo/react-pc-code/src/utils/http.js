import axios from 'axios'
import { getToken } from './token'
import { history } from './history'
const http = axios.create({
  baseURL: 'http://geek.itheima.net/v1_0',
  timeout: 5000
})

// 添加请求拦截器
http.interceptors.request.use((config) => {
  const token = getToken()
  if (token) {
    config.headers.Authorization = `Bearer ${token}`
  }
  return config
}, (error) => {
  return Promise.reject(error)
})

// 添加响应拦截器
http.interceptors.response.use((response) => {
  return response.data
}, (error) => {
  if (error.response.status === 401) {
    history.push('/login')
  }
  return Promise.reject(error)
})

// 添加一个用于获取 JWT 令牌的方法
http.getMyToken = async ({ mobile, code }) => {
  try {
    const response = await http.post('/login', { mobile, code })
    return response.data
  } catch (error) {
    // 在这里处理错误，例如显示一个错误消息
    console.error(error)
    throw error
  }
}

export { http }
