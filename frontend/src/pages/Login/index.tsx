import Footer from "components/footer";
import LoginForm from "components/loginForm";
import NavBar from "components/navbar";

function Login() {
    return (
       <>
        <NavBar/>
        <div className="container">
          <LoginForm/>
        </div>
        <Footer/>
      </>
    );
  }
  
  export default Login;