import axios from 'axios';
import Person from './persons';
 
export const getAllPersons =async()=>{
 
    const response = await axios.get('http://localhost:3000/persons')
 
    return response.data;
}
 
export const addPerson = async(person: Omit<Person, "id">)=>{
 
    await axios.post('http://localhost:3000/persons',person);
}
 
export const deletePerson = async(id:number)=>{
    await axios.delete(`http://localhost:3000/persons/${id}`);
}
 
 