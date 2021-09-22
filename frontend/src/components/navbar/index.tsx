import { Link } from "react-router-dom";

function NavBar() {
    return (
        <header className="p-3 bg-dark text-white">
            <div className="container">
                <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                    
                <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="/" className="nav-link px-2 text-secondary">Home</a></li>
                </ul>
        
                <div className="text-end">
                    <Link to="/login"><button type="button" className="btn btn-outline-light me-2">Logar</button></Link>
                    <Link to="/cad"><button type="button" className="btn btn-primary">Cadastrar-se</button></Link>               
                </div>            
                </div>
            </div>
      </header>
    );
  }
  
export default NavBar;