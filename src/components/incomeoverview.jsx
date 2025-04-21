import { BarChart, Bar, XAxis, Tooltip } from 'recharts';
import { Paper, Typography } from '@mui/material';
const data = [
  { name: 'Mo', income: 1000 },
  { name: 'Tu', income: 1500 },
  { name: 'We', income: 1200 },
  { name: 'Th', income: 800 },
  { name: 'Fr', income: 1100 },
  { name: 'Sa', income: 900 },
  { name: 'Su', income: 1300 },
];
const IncomeOverview = () => (
  <Paper sx={{ p: 2 }}>
    <Typography variant="subtitle1" mb={2}>This Week Statistics</Typography>
    <Typography variant="h5" fontWeight="bold" mb={2}>$7,650</Typography>
    <BarChart width={300} height={200} data={data}>
      <XAxis dataKey="name" />
      <Tooltip />
      <Bar dataKey="income" fill="#4dd0e1" radius={4} />
    </BarChart>
  </Paper>
);
export default IncomeOverview;