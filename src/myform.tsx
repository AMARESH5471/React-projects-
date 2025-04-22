import React from 'react';
import { Formik, Form, Field, ErrorMessage } from 'formik';
import { validationSchema } from './formvalidation';
import './index.css';
 
interface FormValues {
  name: string;
  email: string;
  password: string;
  age: number;
  gender: string;
  country: string;
  termsAccepted: boolean;
  bio: string;
  file: File | null;
}
 
const MyForm: React.FC = () => {
  const initialValues: FormValues = {
    name: '',
    email: '',
    password: '',
    age: 0,
    gender: '',
    country: '',
    termsAccepted: false,
    bio: '',
    file: null,
  };
 
  return (
    <div className="form-container">
      <h2>Full Form with All Input Types</h2>
      <Formik
        initialValues={initialValues}
        validate={(values) => {
          const result = validationSchema.safeParse(values);
          if (result.success) return {};
          const errors: any = {};
          result.error.errors.forEach((err) => {
            errors[err.path[0]] = err.message;
          });
          return errors;
        }}
        onSubmit={(values) => {
          console.log('Submitted:', values);
          alert('Form Submitted');
        }}
      >
        {({ isSubmitting, setFieldValue }) => (
          <Form>
            {/* Name */}
            <label>Name:</label>
            <Field type="text" name="name" />
            <ErrorMessage name="name" component="div" className="error" />
 
            {/* Email */}
            <label>Email:</label>
            <Field type="email" name="email" />
            <ErrorMessage name="email" component="div" className="error" />
 
            {/* Password */}
            <label>Password:</label>
            <Field type="password" name="password" />
            <ErrorMessage name="password" component="div" className="error" />
 
            {/* Age */}
            <label>Age:</label>
            <Field type="number" name="age" />
            <ErrorMessage name="age" component="div" className="error" />
 
            {/* Gender (Radio) */}
            <label>Gender:</label>
            <div role="group">
              <label><Field type="radio" name="gender" value="male" /> Male</label>
              <label><Field type="radio" name="gender" value="female" /> Female</label>
            </div>
            <ErrorMessage name="gender" component="div" className="error" />
 
            {/* Country (Select) */}
            <label>Country:</label>
            <Field as="select" name="country">
              <option value="">Select</option>
              <option value="India">India</option>
              <option value="USA">USA</option>
              <option value="Canada">Canada</option>
            </Field>
            <ErrorMessage name="country" component="div" className="error" />
 
            {/* Terms (Checkbox) */}
            <label>
              <Field type="checkbox" name="termsAccepted" />
              I accept terms
            </label>
            <ErrorMessage name="termsAccepted" component="div" className="error" />
            {/* File Upload */}
            <label>Upload File:</label>
            <input
              type="file"
              onChange={(e) => setFieldValue('file', e.currentTarget.files?.[0] || null)}
            />
            <ErrorMessage name="file" component="div" className="error" />
 
            {/* Submit */}
            <button type="submit" disabled={isSubmitting}>
              Submit
            </button>
          </Form>
        )}
      </Formik>
    </div>
  );
};
export default MyForm;