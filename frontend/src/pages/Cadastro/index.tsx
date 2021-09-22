import Footer from "components/footer";
import NavBar from "components/navbar";
import SingupForm from "components/singupForm";

function Cadastro() {
    return (
    <>
        <NavBar/>
        <div className="container">
          <SingupForm/>
        </div>
        <Footer/>
      </>
    );
  }
  
  export default Cadastro;