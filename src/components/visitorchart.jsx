import { LineChart, Line, XAxis, YAxis, CartesianGrid, Tooltip, Area, AreaChart } from 'recharts';
import { Paper, Typography, ToggleButton, ToggleButtonGroup, Box } from '@mui/material';
import { useState } from 'react';
const data = [
  { name: 'Jan', uv: 100, pv: 80 },
  { name: 'Feb', uv: 60, pv: 100 },
  { name: 'Mar', uv: 150, pv: 100 },
  { name: 'Apr', uv: 40, pv: 90 },
  { name: 'May', uv: 60, pv: 105 },
  { name: 'Jun', uv: 30, pv: 120 },
  { name: 'Jul', uv: 70, pv: 90 },
];
const VisitorChart = () => {
  const [view, setView] = useState('month');
  return (
    <Paper sx={{ p: 2 }}>
      <Box display="flex" justifyContent="space-between" alignItems="center" mb={2}>
        <Typography variant="subtitle1">Unique Visitor</Typography>
        <ToggleButtonGroup
          value={view}
          exclusive
          onChange={(e, val) => setView(val)}
          size="small"
        >
          <ToggleButton value="month">Month</ToggleButton>
          <ToggleButton value="week">Week</ToggleButton>
        </ToggleButtonGroup>
      </Box>
      <AreaChart width={600} height={250} data={data}>
        <defs>
          <linearGradient id="colorUv" x1="0" y1="0" x2="0" y2="1">
            <stop offset="5%" stopColor="#3f51b5" stopOpacity={0.8}/>
            <stop offset="95%" stopColor="#3f51b5" stopOpacity={0}/>
          </linearGradient>
        </defs>
        <XAxis dataKey="name" />
        <YAxis />
        <CartesianGrid strokeDasharray="3 3" />
        <Tooltip />
        <Area type="monotone" dataKey="pv" stroke="#3f51b5" fillOpacity={1} fill="url(#colorUv)" />
        <Area type="monotone" dataKey="uv" stroke="#1a237e" />
      </AreaChart>
    </Paper>
  );
};
export default VisitorChart;