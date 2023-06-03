// login module
import { makeAutoObservable } from 'mobx'
import { http, setToken, getToken, removeToken } from '@/utils'
import { message } from 'antd'
class LoginStore {

  token = getToken() || ''
  constructor() {
    // 响应式
    makeAutoObservable(this)
  }
  getMyToken = async ({ mobile, code }) => {
    // 调用登录接口
    await http.post('http://geek.itheima.net/v1_0/authorizations', {
      mobile,
      code
    }).then((res) => {
      if (res.error_code === "001") {
        message.error("用户名/密码不正确")
      } else {
        // 存入token
        this.token = res.data.token
        // 存入ls
        setToken(this.token)
      }
    }).catch((error) => {
      message.error("用户名或者密码不争取")
    })

  }
  // 退出登录
  loginOut = () => {
    this.token = ''
    removeToken()
  }
}

export default LoginStore