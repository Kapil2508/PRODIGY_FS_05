import axios from 'axios';

const BASE_URL = "http://localhost:8039/api/posts";

export const getAllPosts = () => {
  return axios.get(BASE_URL);
};

export const createPost = (postData) => {
  return axios.post(BASE_URL, postData);
};

export const getPostById = (id) => {
  return axios.get(`${BASE_URL}/${id}`);
};