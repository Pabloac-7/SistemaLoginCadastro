import axios from "axios";
import { Link } from "react-router-dom";
import { BASE_URL } from "utils/requests";

function SingupForm() {

    const l = {
        nome: "",
        senha:""
    }
   
    const handleName = (event: { target: { value: string; }; }) => {
        l.nome = event.target.value;
    }
     const handlePass= (event: { target: { value: string; }; }) => {
        l.senha = event.target.value;
    }

    const handleSubmit = (event: { preventDefault: () => void; }) => {
        event.preventDefault();

       
        axios.post(`${BASE_URL}/users/save`, {id: "", nome: l.nome, senha: l.senha})
            .then(res => {
                if(res.status===200){
                    alert("Casdastrado com Sucesso!");
                }        
          }).catch(() => {
                alert("Casdastrado invalido! Usuario existente ou erro no servidor");
            })
     }

    return (
    <body className="text-center">
        <main className="form-signup" style={{display: 'flex', justifyContent: 'center'}}>
            <form onSubmit={handleSubmit}>
                <br/>
                <h1 className="h3 mb-3 fw-normal">Cadastre-se no sistema</h1>
                <br/>
                <div className="form-floating">
                <input type="text" className="form-control" id="floatingInput" placeholder="Nome" onChange={handleName} />
                <label htmlFor="floatingInput">Nome</label>
                </div>
                <div className="form-floating">
                <input type="password" className="form-control" id="floatingPassword" placeholder="Senha" onChange={handlePass}/>
                <label htmlFor="floatingPassword">Senha</label>
                </div>
                <div>
                    <br/>
                    <button className="w-100 btn btn-lg btn-primary" type="submit">Cadastrar</button>
                </div>
                <div>
                    <br/>                   
                    <Link to="/"><button type="button" className="btn btn-link">Voltar</button></Link>
                </div>
            </form>
        </main>
    </body>
    );
  }

export default SingupForm;