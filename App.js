import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

const { Kafka } = require('kafkajs')
//import kafka from "kafka-node"
class App extends Component {
  render() {
 
const kafka = new Kafka({
  clientId: 'my-app',
  brokers: ['kafka1:9092', 'kafka2:9092']
})
 
// // Producing
// const producer = kafka.producer()
 
//  producer.connect()
//  producer.send({
//   topic: 'test-topic',
//   messages: [
//     { value: 'Hello KafkaJS user!' },
//   ],
// })
 
// Consuming
const consumer = kafka.consumer({ groupId: 'test-group' })
 
 consumer.connect()
 consumer.subscribe({ topic: 'test-topic' })
 
 consumer.run({
  eachMessage: async ({ topic, partition, message }) => {
    console.log({
      value: message.value.toString(),
    })
  },
})
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export default App;
