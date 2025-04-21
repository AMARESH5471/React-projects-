import { Grid, Container, Typography } from '@mui/material';
import StatCard from './components/incomeoverview';
import VisitorChart from './components/visitorchart';
import IncomeOverview from './components/statcard';
function App() {
  return (
    <Container sx={{ mt: 4 }}>
      <Typography variant="h6" fontWeight="bold" mb={3}>Dashboard</Typography>
      <Grid container spacing={2}>
        <Grid item xs={12} sm={6} md={3}>
          <StatCard title="Total Page Views" value="4,42,236" growth="59.3%" extra="35,000" isPositive />
        </Grid>
        <Grid item xs={12} sm={6} md={3}>
          <StatCard title="Total Users" value="78,250" growth="70.5%" extra="8,900" isPositive />
        </Grid>
        <Grid item xs={12} sm={6} md={3}>
          <StatCard title="Total Order" value="18,800" growth="27.4%" extra="1,943" isPositive={false} />
        </Grid>
        <Grid item xs={12} sm={6} md={3}>
          <StatCard title="Total Sales" value="35,078" growth="27.4%" extra="20,395" isPositive={false} />
        </Grid>
      </Grid>

      <Grid container spacing={2} mt={2}>
        <Grid item xs={12} md={8}>
          <VisitorChart />
        </Grid>
        <Grid item xs={12} md={4}>
          <IncomeOverview />
        </Grid>
      </Grid>
    </Container>
  );
}

export default App;
