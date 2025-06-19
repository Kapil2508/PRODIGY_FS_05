import React, { useState } from 'react';
import { createPost } from '../services/PostService';

function CreatePost() {
  const [caption, setCaption] = useState('');
  const [imageUrl, setImageUrl] = useState('');
  const [videoUrl, setVideoUrl] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const newPost = {
      caption,
      imageUrl,
      videoUrl,
      createdBy: { id: 1 } 
    };

    createPost(newPost)
      .then(() => {
        alert(" Post created successfully!");
        setCaption('');
        setImageUrl('');
        setVideoUrl('');
      })
      .catch(error => {
        alert(" Error creating post.");
        console.error(error);
      });
  };

  return (
    <form onSubmit={handleSubmit} style={{ maxWidth: '400px', margin: 'auto' }}>
      <h2>Create Post</h2>

      <input
        type="text"
        placeholder="Caption"
        value={caption}
        onChange={e => setCaption(e.target.value)}
        required
        style={{ width: '100%', marginBottom: '10px' }}
      />

      <input
        type="text"
        placeholder="Image URL (optional)"
        value={imageUrl}
        onChange={e => setImageUrl(e.target.value)}
        style={{ width: '100%', marginBottom: '10px' }}
      />

      <input
        type="text"
        placeholder="Video URL (optional)"
        value={videoUrl}
        onChange={e => setVideoUrl(e.target.value)}
        style={{ width: '100%', marginBottom: '10px' }}
      />

      <button type="submit" style={{ width: '100%' }}>Post</button>
    </form>
  );
}

export default CreatePost;
