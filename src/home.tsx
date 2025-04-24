import { Link } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { Employee } from './types';
import { FaPlus, FaEdit, FaTrash } from 'react-icons/fa';

export default function Home() {
  const [employees, setEmployees] = useState<Employee[]>([]);
  const [selected, setSelected] = useState<number[]>([]);

  useEffect(() => {
    const stored = localStorage.getItem('employees');
    if (stored) {
      setEmployees(JSON.parse(stored));
    }
  }, []);

  const deleteEmployee = (id: number) => {
    const confirm = window.confirm("Are you sure you want to delete this employee?");
    if (!confirm) return;

    const updated = employees.filter(emp => emp.id !== id);
    setEmployees(updated);
    localStorage.setItem('employees', JSON.stringify(updated));
    setSelected(prev => prev.filter(sel => sel !== id));
  };

  const handleSelect = (id: number) => {
    setSelected(prev =>
      prev.includes(id) ? prev.filter(item => item !== id) : [...prev, id]
    );
  };

  const deleteSelected = () => {
    const confirm = window.confirm("Are you sure you want to delete the selected employees?");
    if (!confirm) return;

    const updated = employees.filter(emp => !selected.includes(emp.id));
    setEmployees(updated);
    localStorage.setItem('employees', JSON.stringify(updated));
    setSelected([]);
  };

  return (
    <div className="container">
      <div className="header">
        <h2>Employee List</h2>
        <div style={{ display: 'flex', gap: '10px' }}>
          <Link to="/add" className="btn">
            <FaPlus /> Add Employee
          </Link>
          <button
            onClick={deleteSelected}
            className="btn danger"
            disabled={selected.length === 0}
          >
            <FaTrash /> Delete Selected
          </button>
        </div>
      </div>
      {employees.length === 0 ? (
        <p>No employees found.</p>
      ) : (
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
                    onChange={() => handleSelect(emp.id)}
                  />
                </td>
                <td>{emp.name}</td>
                <td>{emp.email}</td>
                <td>{emp.role}</td>
                <td>
                  <Link to={`/edit/${emp.id}`} className="action-icon">
                    <FaEdit />
                  </Link>
                  <button
                    className="action-icon"
                    onClick={() => deleteEmployee(emp.id)}
                  >
                    <FaTrash />
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}