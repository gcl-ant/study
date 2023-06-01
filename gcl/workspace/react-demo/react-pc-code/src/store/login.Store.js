// login module
import { makeAutoObservable } from 'mobx'
import { http, setToken, getToken, removeToken } from '@/utils'
import {  message } from 'antd'
class LoginStore {

  token = getToken() || ''
  constructor() {
    // 响应式
    makeAutoObservable(this)
  }
  getToken = async ({ mobile, code }) => {
    // 调用登录接口
    await http.post('http://127.0.0.1:8088/doLogin', {
      "user_name":mobile,
      "password": code
    }).then( (res) => {
      
      if (res.error_code === "001"){
        message.error("用户名/密码不正确")
        return false
      } else {
          // 存入token
          this.token = res.user_name      
          // 存入ls
          setToken(this.token)
          return true
      }
      return false
    })
   
  }
  // 退出登录
  loginOut = () => {
    this.token = ''
    removeToken()
  }
}

export default LoginStore