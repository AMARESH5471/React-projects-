import { Card, CardContent, Typography, Box } from '@mui/material';
import ArrowUpwardIcon from '@mui/icons-material/ArrowUpward';
import ArrowDownwardIcon from '@mui/icons-material/ArrowDownward';
const StatCard = ({ title, value, growth, extra, isPositive }) => (
  <Card sx={{ minWidth: 200 }}>
    <CardContent>
      <Typography variant="subtitle2">{title}</Typography>
      <Typography variant="h5" fontWeight="bold">{value}</Typography>
      <Box display="flex" alignItems="center" color={isPositive ? 'success.main' : 'warning.main'}>
        {isPositive ? <ArrowUpwardIcon fontSize="small" /> : <ArrowDownwardIcon fontSize="small" />}
        <Typography variant="body2">{growth}</Typography>
      </Box>
      <Typography variant="caption" color="textSecondary">
        You made an extra <strong>{extra}</strong> this year
      </Typography>
    </CardContent>
  </Card>
);
export default StatCard;