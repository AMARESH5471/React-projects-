import { Routes, Route } from 'react-router-dom';
import Home from './home';
import AddEmployee from './addemployee';
import EditEmployee from './editemployee';

export default function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/add" element={<AddEmployee />} />
      <Route path="/edit/:id" element={<EditEmployee />} />
    </Routes>
  );
}
