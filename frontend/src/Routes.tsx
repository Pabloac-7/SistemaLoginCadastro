import Cadastro from 'pages/Cadastro';
import Home from 'pages/Home';
import Login from 'pages/Login';
import Main from 'pages/Main';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
//yarn add @types/react-router-dom -D

function Routes() {
    return (
    <BrowserRouter>
        <Switch> 
            <Route path="/" exact>
                <Home/>
            </Route>
            <Route path="/cad">
                <Cadastro/>
            </Route>
            <Route path="/login">
                <Login/>
            </Route>
            <Route path="/principal">
                <Main/>
            </Route>
        </Switch>
      </BrowserRouter>
    );
  }
  
  export default Routes;