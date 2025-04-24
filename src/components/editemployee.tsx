import { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';
import { Formik, Form, Field, ErrorMessage } from 'formik';
import { z } from 'zod';
import { toFormikValidationSchema } from 'zod-formik-adapter';

const schema = z.object({
  name: z.string().min(2),
  email: z.string().email(),
  role: z.string().min(2),
});

const EditEmployee = () => {
  const { id } = useParams();
  const [employee, setEmployee] = useState({ name: '', email: '', role: '' });
  const navigate = useNavigate();

  useEffect(() => {
    axios.get(`http://localhost:3001/employees/${id}`).then(res => {
      setEmployee(res.data);
    });
  }, [id]);

  return (
    <div className="form-container">
      <h2>Edit Employee</h2>
      <Formik
        enableReinitialize
        initialValues={employee}
        validationSchema={toFormikValidationSchema(schema)}
        onSubmit={async (values) => {
          await axios.put(`http://localhost:3001/employees/${id}`, values);
          navigate('/');
        }}
      >
        <Form className="form">
          <label>Name</label>
          <Field name="name" />
          <ErrorMessage name="name" component="div" className="error" />

          <label>Email</label>
          <Field name="email" />
          <ErrorMessage name="email" component="div" className="error" />

          <label>Role</label>
          <Field name="role" />
          <ErrorMessage name="role" component="div" className="error" />

          <button type="submit" className="btn">Update</button>
        </Form>
      </Formik>
    </div>
  );
};

export default EditEmployee;
