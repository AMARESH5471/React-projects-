import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './components/home';
import AddEmployee from './components/addemployee';
import EditEmployee from './components/editemployee';
import './index.css';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/add" element={<AddEmployee />} />
        <Route path="/edit/:id" element={<EditEmployee />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
