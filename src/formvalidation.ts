import { z } from 'zod';
export const validationSchema = z.object({
  name: z.string().nonempty("Name is required").regex(/^[A-Za-z\s]+$/, "Name must contain only letters and spaces"),
  email: z.string().nonempty("Email is required").email("Invalid email address"),
  password: z.string().nonempty("Password is required").min(6, "Password must be at least 6 characters"),
  age: z.coerce.number().min(1, "Please enter a valid age"),
  gender: z.string().nonempty("Gender is required"),
  country: z.string().nonempty("Country is required"),
  termsAccepted: z.literal(true, { errorMap: () => ({ message: "You must accept the terms and conditions" }) }),
  file: z.any().refine((file) => file instanceof File, { message: "File is required" }),
});