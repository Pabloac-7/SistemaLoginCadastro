import Footer from "components/footer";
import NavBar from "components/navbar";

function Home() {
    return (
        <>
        <NavBar/>
        <br/><br/>
        <div className="container text-center" style={{display: 'flex', justifyContent: 'center'}}>
            <div className="jumbotrom">
              <br/><br/>
                <h1>Bem vindo ao nosso sistema!</h1>
            </div>
        </div>
        <Footer/>
      </>
    );
  }
  
  export default Home;