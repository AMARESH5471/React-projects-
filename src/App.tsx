import { useEffect, useState } from 'react'
import './App.css'
import Person from './persons'
import { addPerson,  getAllPersons } from './service';
function App() {
  const [persons,setPersons] = useState<Person[]>([])
  // const [error,setError] =  useState<boolean>(false);
 
  const newPerson ={
     
     name:'Harish',
     city:'AndraPradesh'
  }
 
  const newP2 = {
   
    name:'Ghandi Thata',
    city:'England'
  }
 
  useEffect(()=>{
    getAllPersons().then( data=>setPersons(data)).catch(error=>console.log(error));
    addPerson(newPerson)
    addPerson(newP2);
   
  },[])
  return (
    <div>
    {persons.map((person,index)=>(
      <div key={index} style={  {backgroundColor:'lightblue',borderRadius:'15px',display:'grid',gridTemplateColumns:'200px 200px 200px',gridAutoRows:'auto',justifyContent:'center',alignItems:'center',gridRow:'20px',margin:'20px'}}>
        <h2>{person.name}</h2>
        <h4>{person.city}</h4>
        <h6>{person.id}</h6>
      </div>
    ))}
    </div>
  )
}
 
export default App