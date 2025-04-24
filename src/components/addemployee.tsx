import { Formik, Form, Field, ErrorMessage } from 'formik';
import { z } from 'zod';
import { toFormikValidationSchema } from 'zod-formik-adapter';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const schema = z.object({
  name: z.string().min(2),
  email: z.string().email(),
  role: z.string().min(2),
});

const AddEmployee = () => {
  const navigate = useNavigate();

  return (
    <div className="form-container">
      <h2>Add Employee</h2>
      <Formik
        initialValues={{ name: '', email: '', role: '' }}
        validationSchema={toFormikValidationSchema(schema)}
        onSubmit={async (values) => {
          await axios.post('http://localhost:3001/employees', values);
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

          <button type="submit" className="btn">Submit</button>
        </Form>
      </Formik>
    </div>
  );
};

export default AddEmployee;
