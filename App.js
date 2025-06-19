import './App.css';
import React from 'react';
import PostList from './components/PostList';
import CreatePost from './components/CreatePost';

function App() {
  return (
    <div className="App">
      <CreatePost />
      <hr />
      <PostList />
    </div>
  );
}

export default App;
