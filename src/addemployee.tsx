import { useNavigate } from 'react-router-dom';
import { useState } from 'react';
import { Employee } from './types';

export default function AddEmployee() {
  const [formData, setFormData] = useState<Employee>({
    id: Date.now(),
    name: '',
    email: '',
    role: '',
    department: '',
  });

  const navigate = useNavigate();

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    const existing = JSON.parse(localStorage.getItem('employees') || '[]');
    existing.push(formData);
    localStorage.setItem('employees', JSON.stringify(existing));

    navigate('/');
  };

  return (
    <form onSubmit={handleSubmit} className="form">
      <h2>Add Employee</h2>
      <input name="name" placeholder="Name" onChange={handleChange} required />
      <input name="email" placeholder="Email" onChange={handleChange} required />
      <input name="role" placeholder="Role" onChange={handleChange} required />
      <input name="department" placeholder="Department" onChange={handleChange} required />
      <button type="submit">Submit</button>
    </form>
  );
}