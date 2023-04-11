const resolver = {
  Query: {
    books: () => [
      {
        id: 1,
        name: "Harry Potter",
        genre: "Fantasy",
      },
      {
        id: 2,
        name: "Lord of the Rings",
        genre: "Fantasy",
      },
    ],
  },
};

module.exports = resolver;
