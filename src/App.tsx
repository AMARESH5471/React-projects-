import React from 'react';
import './App.css';
import MyForm from './myform'; // Make sure filename casing matches
 
const App: React.FC = () => {
  return (
<div className="App">
<h1>Welcome to the Formik Demo</h1>
<MyForm />
</div>
  );
};
export default App;