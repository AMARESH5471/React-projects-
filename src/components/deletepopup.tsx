interface Props {
    onCancel: () => void;
    onConfirm: () => void;
  }
  
  export default function DeletePopup({ onCancel, onConfirm }: Props) {
    return (
      <div className="popup">
        <div className="popup-card">
          <p>Are you sure you want to delete the selected employee(s)?</p>
          <div className="popup-actions">
            <button className="btn" onClick={onConfirm}>Yes</button>
            <button className="btn danger" onClick={onCancel}>No</button>
          </div>
        </div>
      </div>
    );
  }
  