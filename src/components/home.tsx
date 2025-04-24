import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';
import { Employee } from './types';
import { FaPlus, FaEdit, FaTrash } from 'react-icons/fa';
import DeletePopup from './deletepopup';

const Home = () => {
  const [employees, setEmployees] = useState<Employee[]>([]);
  const [selected, setSelected] = useState<number[]>([]);
  const [showPopup, setShowPopup] = useState(false);

  const fetchEmployees = async () => {
    const res = await axios.get('http://localhost:3001/employees');
    setEmployees(res.data);
  };

  useEffect(() => {
    fetchEmployees();
  }, []);

  const toggleSelect = (id: number) => {
    setSelected(prev =>
      prev.includes(id) ? prev.filter(e => e !== id) : [...prev, id]
    );
  };

  const deleteSelected = async () => {
    for (const id of selected) {
      await axios.delete(`http://localhost:3001/employees/${id}`);
    }
    setSelected([]);
    fetchEmployees();
    setShowPopup(false);
  };

  return (
    <div className="container">
      <div className="header">
        <h2>Employee List</h2>
        <div className="actions">
          <Link to="/add" className="btn"><FaPlus /> Add</Link>
          <button
            className="btn danger"
            onClick={() => setShowPopup(true)}
            disabled={selected.length === 0}
          >
            <FaTrash /> Delete Selected
          </button>
        </div>
      </div>

      <table className="employee-table">
        <thead>
          <tr>
            <th>Select</th>
            <th>Name</th>
            <th>Email</th>
            <th>Role</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {employees.map(emp => (
            <tr key={emp.id}>
              <td>
                <input
                  type="checkbox"
                  checked={selected.includes(emp.id)}
                  onChange={() => toggleSelect(emp.id)}
                />
              </td>
              <td>{emp.name}</td>
              <td>{emp.email}</td>
              <td>{emp.role}</td>
              <td>
                <Link to={`/edit/${emp.id}`} className="action-icon"><FaEdit /></Link>
                <button
                  className="action-icon"
                  onClick={() => {
                    setSelected([emp.id]);
                    setShowPopup(true);
                  }}
                >
                  <FaTrash />
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      {showPopup && (
        <DeletePopup
          onCancel={() => {
            setShowPopup(false);
            setSelected([]);
          }}
          onConfirm={deleteSelected}
        />
      )}
    </div>
  );
};

export default Home;
