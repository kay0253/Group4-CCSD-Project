import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://127.0.0.1:8000';

const DeleteItemsAdmin = {
  async deleteCatAdmin(id) {
    const token = await localStorage.getItem('jwtToken');

    try {
      const formData = new FormData();
      formData.append('id', id);

      const response = await axios.post(
        `${API_BASE_URL}/delete_cat_admin/${id}`,
        formData,
        {
          headers: {
            'Content-Type': 'multipart/form-data', // Set content type to multipart/form-data for file uploads
            Authorization: `Bearer ${token}`,
          },
        }
      );

      if (response.status === 200) {
        return response.data;
      }
    } catch (error) {
      if (error.response) {
        console.error('Server responded with an error:', error.response.data);
      } else if (error.request) {
        console.error('No response received:', error.request);
      } else {
        console.error('Error setting up the request:', error.message);
      }
      throw error;
    }
  },
};

export default DeleteItemsAdmin;
