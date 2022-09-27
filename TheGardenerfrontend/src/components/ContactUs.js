
import React, { Component } from "react";
import Card from "react-bootstrap/Card";

import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import "./Card.css";
class ContactUs extends Component {
  render() {
    return (
      <>
        <div class="bg-image1">
          {/* <h2>Contact Details:</h2> */}
          <Container>
            <Row>
              <Col sm>
                <div class="text-header5">
                  {/* <h2 style={{ color: "skyblue" }}>Contact Details:</h2> */}
                  <Card
                    style={{
                      width: "20rem",
                      color: "black",
                      backgroundColor: "skyblue",
                    }}
                  >
                    {/* <Card.Img variant="top" src="holder.js/100px180" /> */}
                    <Card.Body>
                      {/* <Card.Title c>Project Partners</Card.Title> */}
                      <Card.Text>
                        <p>
                          <b>Name:</b> <i>Amol Nagare</i>
                        </p>
                        <p>
                          <b>Email Id:</b> <i>amolnagare7003@gmail.com</i>
                        </p>
                        <p>
                          <b>Mobile Number:</b> <i>7972238993</i>
                        </p>
                        <p>
                          <b>Address:</b> <i>Pune, Maharashtra</i>
                        </p>
                      </Card.Text>
                      {/* <Button variant="primary">Go somewhere</Button> */}
                    </Card.Body>
                  </Card>
                </div>

              </Col>
              <col></col>
            </Row>
            <hr/>
            {/* </Container> */}
            <Row>
              <Col sm>
                <div class="text-header5">
                  {/* <h2 style={{ color: "skyblue" }}>Contact Details:</h2> */}
                  <Card
                    style={{
                      width: "20rem",
                      color: "black",
                      backgroundColor: "skyblue",
                    }}
                  >
                    {/* <Card.Img variant="top" src="holder.js/100px180" /> */}
                    <Card.Body>
                      {/* <Card.Title c>Project Partners</Card.Title> */}
                      <Card.Text>
                        <p>
                          <b>Name:</b> <i>Kiran Jadhao</i>
                        </p>
                        <p>
                          <b>Email Id:</b> <i>jadhaokgdhanu@gmail.com</i>
                        </p>
                        <p>
                          <b>Mobile Number:</b> <i>7620815939</i>
                        </p>
                        <p>
                          <b>Address:</b> <i>Pune,Maharstra</i>
                        </p>
                      </Card.Text>
                      {/* <Button variant="primary">Go somewhere</Button> */}
                    </Card.Body>
                  </Card>
                </div>
              </Col>
              <col></col>
            </Row>
          </Container>
        </div>
      </>
    );
  }
}

export default ContactUs;
