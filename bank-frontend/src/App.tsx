import React from 'react';
import './App.css';
import LoanForm from './components/LoanForm';
import Loan from "./page/Loan";
function App() {
  return (
      <div className="App">
        <h1>Loan Calculator</h1>
        <Loan/>
      </div>
  );
}

export default App;