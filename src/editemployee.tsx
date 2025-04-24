import { useParams, useNavigate } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { Employee } from './types';

export default function EditEmployee() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [formData, setFormData] = useState<Employee | null>(null);

  useEffect(() => {
    const data = JSON.parse(localStorage.getItem('employees') || '[]');
    const emp = data.find((e: Employee) => e.id === parseInt(id!));
    setFormData(emp);
  }, [id]);

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (!formData) return;
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    const all = JSON.parse(localStorage.getItem('employees') || '[]');
    const updated = all.map((emp: Employee) =>
      emp.id === formData?.id ? formData : emp
    );
    localStorage.setItem('employees', JSON.stringify(updated));
    navigate('/');
  };

  if (!formData) return <p>Loading...</p>;

  return (
    <form onSubmit={handleSubmit} className="form">
      <h2>Edit Employee</h2>
      <input name="name" value={formData.name} onChange={handleChange} required />
      <input name="email" value={formData.email} onChange={handleChange} required />
      <input name="role" value={formData.role} onChange={handleChange} required />
      <input name="department" value={formData.department} onChange={handleChange} required />
      <button type="submit">Update</button>
    </form>
  );
}
