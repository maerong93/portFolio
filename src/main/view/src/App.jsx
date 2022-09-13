import logo from './logo.svg';
import './App.css';
import info from './info.png';
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faHouse} from '@fortawesome/free-solid-svg-icons';
import { BrowserRouter as Router, Routes,Route, Link, NavLink } from 'react-router-dom'
import { CSSTransition } from 'react-transition-group'
import { Container, Navbar, Nav } from 'react-bootstrap'
import Home from "./pages/home";
import Info from "./pages/myinfo";
import Portfolio from "./pages/portfolio";

const routes = [
  { path: '/#', name: 'Home', Component: Home },
  { path: '/#info', name: 'MyInfo', Component: Info },
  { path: '/#portfolio', name: 'Portfolio', Component: Portfolio },
]

function App() {
  return (
    <>
    <div className="container">
        <div className="content_wrap">
        <Router>
            <div className="side_header" id="side_header">
                <ul className="main_menu">
                    <li>
                        <Link to="/">
                            <FontAwesomeIcon className="lnr" icon={faHouse} />
                            <span className="link-text">Home</span>
                        </Link>
                    </li>
                    <li>
                        <Link to="/info">
                            <FontAwesomeIcon className="lnr" icon="fa-solid fa-user" />
                            <span className="link-text">About Me</span>
                        </Link>
                    </li>
                    <li>
                        <Link to="/portfolio">
                            <FontAwesomeIcon className="lnr" icon="fa-solid fa-book" />
                            <span className="link-text">Portfolio</span>
                        </Link>
                    </li>
                </ul>
                <div className="side_header_info" id="side_header_info">
                    <div className="side_header_img">
                        <img src={info} alt="hyd"></img>
                    </div>
                    <div className="side_header_name">
                        <h1>한영동</h1>
                        <h4>백엔드 개발자</h4>
                    </div>
                </div>
                <div className="side_link">
                    <ul className="side_ul">
                        <li><a href=""><i className="fab fa-github" Style="color:white;"></i></a></li>
                        <li><a href=""><i className="fab fa-instagram" Style="color:white;"></i></a></li>
                    </ul>
                </div>
                <div className="side_footer">
                    <p>© 2020 All rights reserved.</p>
                </div>
            </div>
            <div className="content" id="content">
                    <Routes>
                        <Route path="/" element={<Home/>}></Route>
                        <Route path="/info" element={<Info/>}></Route>
                        <Route path="/portfolio" element={<Portfolio/>}></Route>
                    </Routes>
             </div>
        </Router>
        </div>
    </div>
    </>
  );
}
export default App;
