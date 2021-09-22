import { Link } from "react-router-dom";

function NavLogado() {
    return (
        <header className="p-3 bg-dark text-white">
            <div className="container">
                <div className="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                    
                <ul className="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <h3>Sistema de Login/Cadastro</h3>
                </ul>
        
                <div className="text-end">
                <Link to="/"><button type="button" className="btn btn-primary">Sair</button></Link>
                </div>
                
                </div>
            </div>
      </header>
    );
  }
  
export default NavLogado;